compareTime <- function(func1, func2, main = "Comparation between functions", start=1, end=50){
  list <- seq(start, end)
  time.1 <- lapply(list, FUN = func1)
  time.2 <- lapply(list, FUN = func2)
  
  temp <- time.2
  
  for(i in 1:length(list)){
    if(as.numeric(four[i]) > as.numeric(three[i])){
      print(i)
      break
    }
  }
  
  plot(unlist(time.1), type= "l", main =main, col="red", ylab = "time" )
  lines(unlist(time.2), type="l", col="lightblue")
}
compareTime(function(x) 8*(x^2), function(n) 64*n* log2(n))
compareTime(function(x) (100 * x)^2, function(x) 2 ^x, start=10, end=30)