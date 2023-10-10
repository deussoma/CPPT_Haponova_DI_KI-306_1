from cat import Cat

class ExperimentalCat(Cat):
    def __init__(self, name, age, breed):
        super().__init__(name, age, breed)

    def get_subject_type(self):
        return "Experimantal cat"