

// 사용자가 입력한 숫자가 홀수인지 짝수인지 판별하는 함수를 작성하세요.
var ghf = '홀수'
var Wkr = '짝수'
var user = 10;
if (user % 2 == 0) {
    console.log(`${Wkr} 입니다`);
}
else {
    console.log(`${ghf}입니다`);
}

//-------------------------------------//

// 아래의 객체를 for in 반복문을 사용하여, 객체의 모든 키와 그에 해당하는 값을 출력하는 코드를 작성하세요.
var person = {
    firstName: 'GilDong',
    lastName: 'Hong',
    age: 20
};

for (var key in person) {
    console.log(`key = ${key}`);
    console.log(`person[key] = ${person[key]}`);
}

//--------------------------------------//

//두 개의 숫자를 매개변수로 받아서 그 합을 반환하는 함수를 작성하세요.

var num1 = 10
var num2 = 50
var test = num1 + num2;
console.log(test)

function add(a, b) {


    // return a + b;
    var num = a + b;
    console.log(num);
}
// console.log(add(10, 45));
add(10, 45);


//----------------------------------------//

//아래의 함수들을 화살표 함수로 변환해보세요.
// function greet() {
//     return "Hello!";
// }


// function getInfo(name, age) {
//     return `name: ${name}, age: ${age}`;
// }

greet = () => { return "Hello!"; }
console.log(greet());


getInfo = (name, age) => `name: ${name}, age: ${age}`;
console.log(getInfo('홍길동', 20));