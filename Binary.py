class Binary:
    def __init__(self,number):
        self.number = number

    def square(self):
        return self.number ** 2
    
    def squareRoot(self):
        return self.number ** 0.5
    
    def nthRoot(self,n):
        return self.number ** (1/n)
    
    def __tostring__(self):
        print("I am not Printable.")

bin_obj = Binary(25)

class Food:
    def __init__(self,name,calories) -> None:
        self.name=name
        self.calories = calories

    
class Apple(Food):
    def __init__(self,name,calories):
        super(name,calories)

    def get_cal(self):
        return self.calories
class Mango(Food):
    def __init__(self,name,calories):
        super(name,calories)

    def get_cal(self):
        return self.calories
class Graphes(Food):
    def __init__(self,name,calories):
        super(name,calories)

    def get_cal(self):
        return self.calories
class Banana(Food):
    def __init__(self,name,calories):
        super(name,calories)

    def get_cal(self):
        return self.calories
    
apple1 = Apple('Kashmiri',450)
mango1 = Mango('Syberian',350)
banana1 = Banana('Japanese',250)
graphes1 = Graphes('Hawaiyan',330)


class Animal:
    def __init__(self,legs,name,calories,cal_burn_per_km):
        self.legs = legs
        self.name = name
        self.calories = calories
        self.cal_burn_per_km = cal_burn_per_km
    
    def walk(self,kms):
        self.calories -= self.cal_burn_per_km * self.km
        if self.calories < 0:
            return self.name + "Dead"
        
    def feed(self,food,calories,food_obj):
        self.calories -=- food_obj.calories


