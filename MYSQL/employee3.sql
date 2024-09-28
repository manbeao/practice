-- 1. 부서코드가 노옹철 사원과 같은 소속의 직원 명단 조회하세요.

-- 서브 쿼리
SELECT 
		DEPT_CODE
FROM employee
WHERE EMP_NAME ='노옹철';

-- 메인쿼리
SELECT
		*
FROM employee
WHERE DEPT_CODE = (SELECT 
						DEPT_CODE
					FROM employee
					WHERE EMP_NAME ='노옹철');



-- 2. 전 직원의 평균 급여보다 많은 급여를 받고 있는 직원의 사번, 이름, 직급코드, 급여를 조회하세요.

-- 서브쿼리
SELECT 
		AVG(SALARY)
FROM employee;

-- 메인쿼리
SELECT
		EMP_ID,
        EMP_NAME,
        JOB_CODE,
        SALARY
FROM employee
WHERE SALARY > (SELECT 
				AVG(SALARY)
				FROM employee);
                
                
                
-- 3. 노옹철 사원의 급여보다 많이 받는 직원의 사번, 이름, 부서코드, 직급코드, 급여를 조회하세요.

-- 서브쿼리
SELECT 
		SALARY
FROM employee
WHERE EMP_NAME='노옹철';

-- 메인 쿼리
SELECT
		EMP_NAME,
        EMP_ID,
        DEPT_CODE,
        SALARY
FROM employee
WHERE SALARY  > (SELECT 
						SALARY
				FROM employee
				WHERE EMP_NAME='노옹철');
                
                
                
-- 4. 가장 적은 급여를 받는 직원의 사번, 이름, 부서코드, 직급코드, 급여, 입사일을 조회하세요.

-- 서브 쿼리
SELECT
		SALARY
FROM employee
ORDER BY SALARY ASC
LIMIT 1;

-- 메인쿼리
SELECT
		EMP_ID,
        EMP_NAME,
        DEPT_CODE,
        SALARY,
        HIRE_DATE
FROM employee
WHERE SALARY = (SELECT
						SALARY
				FROM employee
				ORDER BY SALARY ASC
				LIMIT 1);



-- *** 서브쿼리는 SELECT, FROM, WHERE, HAVING, ORDER BY절에도 사용할 수 있다.

-- 5. 부서별 최고 급여를 받는 직원의 이름, 직급코드, 부서코드, 급여 조회하세요.

-- 서브쿼리
SELECT 
		MAX(SALARY)
FROM employee
WHERE DEPT_CODE = 'D1';

SELECT 
		MAX(SALARY)
FROM employee
WHERE DEPT_CODE = 'D2';

SELECT 
		MAX(SALARY)
FROM employee
WHERE DEPT_CODE = 'D5';

SELECT 
		MAX(SALARY)
FROM employee
WHERE DEPT_CODE = 'D6';

SELECT 
		MAX(SALARY)
FROM employee
WHERE DEPT_CODE = 'D8';

SELECT 
		MAX(SALARY)
FROM employee
WHERE DEPT_CODE IS NULL;

SELECT 
		MAX(SALARY)
FROM employee
WHERE DEPT_CODE = 'D9';

-- 메인쿼리
SELECT
		EMP_NAME,
        JOB_CODE,
        DEPT_CODE,
        SALARY
FROM employee
WHERE SALARY = (SELECT 
						MAX(SALARY)
				FROM employee
				WHERE DEPT_CODE = 'D1')OR
		SALARY = (SELECT 
						MAX(SALARY)
				FROM employee
				WHERE DEPT_CODE = 'D2')OR
		SALARY = (SELECT 
						MAX(SALARY)
				FROM employee
				WHERE DEPT_CODE = 'D5')OR
		SALARY = (SELECT 
						MAX(SALARY)
				FROM employee
				WHERE DEPT_CODE = 'D6')OR
		SALARY =(SELECT 
						MAX(SALARY)
				FROM employee
				WHERE DEPT_CODE IS NULL)OR
		SALARY = (SELECT 
						MAX(SALARY)
				FROM employee
				WHERE DEPT_CODE = 'D8')OR
		SALARY = (SELECT 
						MAX(SALARY)
				FROM employee
				WHERE DEPT_CODE = 'D9');



-- *** 여기서부터 난이도 극상

-- 6. 관리자에 해당하는 직원에 대한 정보와 관리자가 아닌 직원의 정보를 추출하여 조회하세요.
-- 사번, 이름, 부서명, 직급, '관리자' AS 구분 / '직원' AS 구분
-- HINT!! is not null, union(혹은 then, else), distinct

-- 서브 쿼리
SELECT
		EMP_NAME  AS '관리자'
FROM employee
WHERE MANAGER_ID IS NULL;

SELECT
		EMP_NAME  AS '직원'
FROM employee
WHERE MANAGER_ID IS NOT NULL;
		
        
SELECT
		B.JOB_CODE,
        B.JOB_NAME
FROM job B
JOIN ;

-- 메인쿼리
-- SELECT 
-- 		A.EMP_ID AS '사번',
-- 		A.EMP_NAME AS '이름',
--         A.DEPT_CODE AS '부서명',
--         B.JOB_NAME AS '직급',
--         A.MANAGER_ID AS '구분'
-- FROM employee A
-- JOIN (SELECT
-- 					JOB_CODE,
-- 					JOB_NAME
--                     A.MANGER_ID
-- 			FROM job
--             WHERE IF(A.MANAGER_ID IS NULL,'관리자','직원')
--             )B ON(A.JOB_CODE=B.JOB_CODE)
-- ORDER BY MANAGER_ID ASC;


SELECT 
		A.EMP_ID AS '사번',
		A.EMP_NAME AS '이름',
        A.DEPT_CODE AS '부서명',
        A.MANAGER_ID AS '구분'
FROM employee A;
WHERE IF(A.MANAGER_ID IS NULL,'관리자','직원');

-- 7. 자기 직급의 평균 급여를 받고 있는 직원의 사번, 이름, 직급코드, 급여를 조회하세요.
-- 단, 급여와 급여 평균은 만원단위로 계산하세요.
-- HINT!! round(컬럼명, -5)

-- 서브쿼리

-- 8. 퇴사한 여직원과 같은 부서, 같은 직급에 해당하는 직원의 이름, 직급코드, 부서코드, 입사일을 조회하세요.

-- 9. 급여 평균 3위 안에 드는 부서의 부서 코드와 부서명, 평균급여를 조회하세요.
-- HINT!! limit

-- 10. 부서별 급여 합계가 전체 급여의 총 합의 20%보다 많은 부서의 부서명과, 부서별 급여 합계를 조회하세요.