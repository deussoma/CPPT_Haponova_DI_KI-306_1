from experimental_cat import ExperimentalCat

def main():
    my_cat = ExperimentalCat("Nomi", 2, "Common")
    
    my_cat.display_info()

    my_cat.set_name("Fluffy")
    my_cat.set_age(4)
    my_cat.set_breed("Persian")

    print("new cat info:")
    
    my_cat.display_info()

    my_cat.meow()
    my_cat.run()
    my_cat.jump()
    my_cat.purr()
    my_cat.sleep()
    my_cat.eat("tuna")
    my_cat.play("a ball")
    print(my_cat.get_subject_type())

if __name__ == "__main__":
    main()
