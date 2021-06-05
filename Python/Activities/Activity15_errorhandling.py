def a():
    x= 10
    a()
try:
    print(x)
   
except NameError:
    print("x hasn't been defined yet.")