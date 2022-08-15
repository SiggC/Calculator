#!/bin/bash

# This is my calculator task

# User input request
echo "Enter Two numbers : "
read a
read b

# User operation type request
echo "Enter Choice :"
echo "1. Multiplyy"
echo "2. Divide"
echo "3. Add"
echo "4. Subtract"
# Switch Case to perform calculator operations
read ch

#Calculator Operations
case $ch in
  1)res=`echo $a \* $b | bc`
  ;;
  2)res=`echo "scale=2; $a / $b" | bc`
  ;;
  3)res=`echo $a + $b | bc`
  ;;
  4)res=`echo $a - $b | bc`
  ;;
esac
echo "Result : $res"

# Use <./calculator.sh> in terminal to run script through

