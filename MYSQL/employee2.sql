-- JOIN을 이용하여 여러 테이블을 조회 시에는 모든 컬럼에 테이블 별칭을 사용하는 것이 좋다.

-- 1. 직급이 대리이면서 아시아 지역에 근무하는 직원의 사번, 이름, 직급명, 부서명, 지역명, 급여를 조회하세요
SELECT 
	A.EMP_ID,
        A.EMP_NAME,
        B.JOB_NAME,
        C.DEPT_TITLE,
        D.LOCAL_NAME,
        A.SALARY
FROM employee A
INNER JOIN (SELECT
		JOB_CODE,
                JOB_NAME
		FROM job
            WHERE JOB_NAME ='대리'
) B USING(JOB_CODE)
INNER JOIN (SELECT
		DEPT_ID,
                DEPT_TITLE,
                LOCATION_ID
		FROM department
) C ON (A.DEPT_CODE= C.DEPT_ID)
INNER JOIN (SELECT
		LOCAL_CODE,
                NATIONAL_CODE,
                LOCAL_NAME
		FROM location
            WHERE LOCAL_NAME LIKE'%ASIA%'
) D ON (C.LOCATION_ID = D.LOCAL_CODE);



-- 2. 주민번호가 70년대 생이면서 성별이 여자이고, 성이 전씨인 직원의 이름, 주민등록번호, 부서명, 직급명을 조회하세요.
SELECT 
	A.EMP_NAME,
        A.EMP_NO,
        B.DEPT_TITLE,
        C.JOB_NAME
FROM employee A
INNER JOIN (SELECT
	DEPT_ID,
        DEPT_TITLE
	FROM department
) B ON(A.DEPT_CODE = B.DEPT_ID)
INNER JOIN (SELECT 
	JOB_CODE,
        JOB_NAME
FROM job
) C ON (A.JOB_CODE = C.JOB_CODE)
WHERE EMP_NO LIKE '7%' AND 
	  EMP_NAME LIKE '전%' AND
      EMP_NO LIKE '______-2%' OR EMP_NO LIKE '______-4%';



-- 3. 이름에 '형'자가 들어가는 직원의 사번, 이름, 직급명을 조회하세요.
SELECT 
	A.EMP_ID,
        A.EMP_NAME,
        B.JOB_NAME
FROM employee A
INNER JOIN (SELECT
		JOB_CODE,
                JOB_NAME
		FROM job
) B USING(JOB_CODE)
WHERE EMP_NAME LIKE '%형%';



-- 4. 해외영업팀에 근무하는 직원의 이름, 직급명, 부서코드, 부서명을 조회하세요.
SELECT
	A.EMP_NAME,
        B.JOB_NAME,
        A.DEPT_CODE,
        C.DEPT_TITLE
FROM employee A 
INNER JOIN (SELECT 
	JOB_CODE,
        JOB_NAME
	FROM job
) B USING(JOB_CODE)
INNER JOIN (SELECT
		DEPT_ID,
                DEPT_TITLE
		FROM department
            WHERE DEPT_TITLE LIKE '%해외%'
) C ON(A.DEPT_CODE = C.DEPT_ID);


-- 5. 보너스포인트를 받는 직원의 이름, 보너스, 부서명, 지역명을 조회하세요.

SELECT
	A.EMP_NAME,
        A.BONUS,
        B.DEPT_TITLE,
        C.LOCAL_NAME
FROM employee A
INNER JOIN (SELECT
		DEPT_ID,
                DEPT_TITLE,
                LOCATION_ID
		FROM department
) B ON (A.DEPT_CODE = B.DEPT_ID)
INNER JOIN (SELECT
		LOCAL_CODE,
                LOCAL_NAME
		FROM location
) C ON (B.LOCATION_ID = C.LOCAL_CODE)
WHERE A.BONUS IS NOT NULL;



-- 6. 부서코드가 D2인 직원의 이름, 직급명, 부서명, 지역명을 조회하세오.
SELECT 
	A.EMP_NAME,
        B.JOB_NAME,
        C.DEPT_TITLE,
        D.LOCAL_NAME
FROM employee A
INNER JOIN (SELECT
					JOB_CODE,
                    JOB_NAME
			FROM job
) B USING(JOB_CODE)
INNER JOIN (SELECT
					DEPT_ID,
                    DEPT_TITLE,
                    LOCATION_ID
			FROM department
) C ON(A.DEPT_CODE = C.DEPT_ID)
INNER JOIN (SELECT
					LOCAL_CODE,
					LOCAL_NAME
            FROM location
) D ON (C.LOCATION_ID =D.LOCAL_CODE)
WHERE DEPT_CODE = 'D2';



-- 7. 한국(KO)과 일본(JP)에 근무하는 직원의 이름, 부서명, 지역명, 국가명을 조회하세요.
SELECT 
		A.EMP_NAME,
        B.DEPT_TITLE,
        C.LOCAL_NAME,
        D.NATIONAL_NAME
FROM employee A
INNER JOIN (SELECT
					DEPT_ID,
                    DEPT_TITLE,
                    LOCATION_ID
			FROM department
) B ON (A.DEPT_CODE = B.DEPT_ID)
INNER JOIN (SELECT
					LOCAL_CODE,
                    LOCAL_NAME,
                    NATIONAL_CODE
			FROM location
) C ON (B.LOCATION_ID = C.LOCAL_CODE)
INNER JOIN (SELECT
					NATIONAL_CODE,
                    NATIONAL_NAME
			FROM nation
            WHERE NATIONAL_CODE ='KO' OR NATIONAL_CODE = 'JP'
) D ON(C.NATIONAL_CODE= D.NATIONAL_CODE);
;
        
