
// fabresult, will print first n number's
//@params n : Number of element in fab. series

def fabresult(n){  // initialize
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
  // check the result or print the result
  print(result)
  print('\n')
  return result
}

// Can't add the test cases, but check's the functionaltiy of above api, using assertion
def fabresult_2 = fabresult(2)
def fabresult_8 = fabresult(8) // calling the function with 8 as an argument in fabresult() api to get first 8 element in fab. series
def fabresult_9 = fabresult(9)
def fabresult_11 = fabresult(11)
def fabresult_12 = fabresult(12)

assert fabresult_2 == '0,1' : "not equal, failed when displaying first 2 elements"
assert fabresult_8 == '0,1,1,2,3,5,8,13' : "not equal, failed while displaying first 8 elements"
assert fabresult_9 == '0,1,1,2,3,5,8,13,21' : "not equal, failed while displaying first 9 elements"
assert fabresult_11 == '0,1,1,2,3,5,8,13,21,34,55' : "not equal, failed while displaying first 11 elements"
assert fabresult_12 == '0,1,1,2,3,5,8,13,21,34,55,89' : "not equal, failed while displaying first 12 elements"
