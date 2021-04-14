
// fabresult, will print first n number's
//@params n : Number of element in fab. series

def fabresult(n){ 
 // initialize
 def a = 0
 def b = 1
 def result = '0,1,'
 
  if(n == 0){
    result = ''
  }else if(n == 1){
    result = '0'
  }else if(n == 2){
    result = '0,1'
  }else{
    def c = 0
    for(i=0 ; i< n-2 ; i++){
      c = a + b
      a = b
      b = c
      if(i == n-3){
       result += +c
      }else{
        result+= c+','
      }
    }
  }
  print(result)
}

// calling the function fabresult
   // @params number : Number of element in fab. series

fabresult(8)
