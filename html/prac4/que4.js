// const text = `Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.`;
const text1 = 'Hello World One';
console.log(text1);
var a = [];
vowel = ['a','e','i','o','u','A','E','I','O','U'];
var count = 0;
for (const key in text1) {
  if (vowel.includes(text1.charAt(key))) {
    a.push(text1.charAt(key))
    count++;
  }
}
console.log(`Vovels appeared are ${[a]}`);
console.log(`count of vovwels: ${count}`);
