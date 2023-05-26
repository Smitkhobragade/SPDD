var marks = 54;
function checkGrade(marks){
  if(marks<65 && marks>50){
    console.log('Grade C');
  }
  else if(marks<80 && marks>65){
    console.log('Grade B');
  }
  else if(marks<90 && marks>80){
    console.log('Grade A');
  }
  else if(marks > 90){
    console.log('Grade A+');
  }
}
checkGrade(marks);
marks = 65;
checkGrade(marks);
marks = 81;
checkGrade(marks);
marks = 95;
checkGrade(marks);