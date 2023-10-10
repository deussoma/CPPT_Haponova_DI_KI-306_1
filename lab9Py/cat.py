import os

class Cat:
    def __init__(self, name="", age=0, breed=""):
        self.name = name
        self.age = age
        self.breed = breed

    def set_name(self, name):
        self.name = name

    def set_age(self, age):
        self.age = age

    def set_breed(self, breed):
        self.breed = breed

    def get_name(self):
        return self.name

    def get_age(self):
        return self.age

    def get_breed(self):
        return self.breed

    def meow(self):
        print(self.name + " says: Meow!")

    def run(self):
        print(self.name + " is running.")

    def jump(self):
        print(self.name + " jumped.")

    def purr(self):
        print(self.name + " is purring.")

    def sleep(self):
        print(self.name + " is sleeping.")

    def eat(self, food):
        print(self.name + " is eating " + food + ".")

    def play(self, toy):
        print(self.name + " is playing with " + toy + ".")

    def display_info(self):
        print("Name:", self.name)
        print("Age:", self.age)
        print("Breed:", self.breed)
