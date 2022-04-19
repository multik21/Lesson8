public class employee {
    public static void main(String[] args) {
            public class employee {
                private String surname;
                private String name;
                private String patronymic;
                private String post;
                private String email;
                private String telephone;
                private int salary;
                private int age;


                public employee(String surname, String name, String patronymic, String post, String email, String telephone, int salary, int age) {
                    this.surname = surname;
                    this.name = name;
                    this.patronymic = patronymic;
                    this.post = post;
                    this.email = email;
                    this.telephone = telephone;
                    this.salary = salary;
                    this.age = age;
                }

                public String toString() {
                    return "Фамилия: %s \nИмя: %s \nОтчество: %s \nДолжность: %s \nEmail: %s \nТелефон: %s \nЗарплата: %d \n Возраст: %d \n";

                }
                employee[] persArray = new employee[5];
                persArray[0] = new employee("Зольцев", "Василий", "Олегович", "Директор", "v@mail,ru", "+78000004565", 10000, 45);
                persArray[1] = new employee("Мальцев", "Олег", "Муратович", "Менеджер", "i@mail,ru", "+79996757677", 1000, 25);
                persArray[2] = new employee("Тайкина", "Анжела", "Владимировна", "Секретарь", "k@mail,ru", "+77894567896", 35000, 31);
                persArray[3] = new employee("Голоб", "Армудин", "Сергеевич", "Логист", "y@mail,ru", "+79064255654", 450, 46);
                persArray[4] = new employee("Савченко", "Гоша", "Тагирович", "Монтажник", "qq@mail,ru", "+74567893656", 7890, 41);


        for (int i=0; i < persArray.length; i++)
                        if (persArray[i].age >= 40) persArray[i].println();

            }
            }

        }


