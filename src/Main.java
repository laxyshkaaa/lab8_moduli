class Person {
    public String FIO;
    public String YearOfBirth;


    Person(String FIO, String YearOfBirth ) {
        this.FIO = FIO;
        this.YearOfBirth = YearOfBirth;
    }
    public void D1(){
        System.out.printf("Его зовут %s, он родился в %s году", FIO, YearOfBirth);
    }
}
class Auto {
    public String Mark;
    public int ExitYear;
    public double Capacity;

    Auto(String Mark, int ExitYear, double Capacity) {
        this.Capacity = Capacity;
        this.ExitYear = ExitYear;
        this.Mark = Mark;
    }

    public void D2() {
        System.out.printf("Машина %s, она вышла в %d году, обьем ее двигателя %f", Mark, ExitYear, Capacity);
    }
}

    class Book {
        public String BookName;
        public String Author;
        public int BookExitYear;

        Book(String BookName, String Author, int BookExitYear) {
            this.Author = Author;
            this.BookExitYear = BookExitYear;
            this.BookName = BookName;
        }

        public void D3() {
            System.out.printf("Книга называется %s, ее автор %s, она вышла в %d году", BookName, Author, BookExitYear);
        }
        public void Final(Person p, Auto a){
            System.out.printf("%s читает книгу %s про машину %s", p.FIO, BookName, a.Mark );
        }
    }

        public class Main {
            public static void main(String[] args) {
                Person p1 = new Person("Валерий Петров", "2007");
                Auto a1 = new Auto("BMW", 2000, 20.3);
                Book b1 = new Book("Химия", "Иван", 2011);
                p1.D1();
                System.out.println();
                a1.D2();
                System.out.println();
                b1.D3();
                System.out.println();
                b1.Final(p1,a1 );

            }
        }


