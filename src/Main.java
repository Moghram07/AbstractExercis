public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Broken Wings",15.99, "Kahlil Gibran");
        Book book1 = new Book("The Prince", 11.69, "Nicolo Machiavelli");
        Book book2 = new Book("The Art of War", 15.29, "Sun Tzu");
        Book book3 = new Book("Unbeatable Mind", 17.95, "Mark Divine");

        System.out.println(book);
        System.out.println(book1);
        // apply discount on books
        book.getDiscount(10); // 10% discount will print info with new price

        Movie movie1 = new Movie("The Showshank Redemption", 15.99,"Frank Darabont");
        Movie movie2 = new Movie("The Green Mile", 13.99, "Frank Darabont");
        Movie movie3 = new Movie("The Count of Monte Cristo", 10.99, "Kevin Reynolds");
        Movie movie4 = new Movie("Tracks", 9.99, "John Curran");
        System.out.println(movie1);
        System.out.println(movie2);
        //apply discount on movies
        movie1.getDiscount(50);// 15% discount
        System.out.println("------------------------------");
        //movable test
        MovablePoints point = new MovablePoints(0, 0, 2, 3);
        System.out.println(point); // Initial position

        point.moveUp();
        System.out.println(point); // Moved up

        point.moveDown();
        System.out.println(point); // Moved down

        point.moveDown();
        System.out.println(point); // Moved down again to see positive value on the y axis

        point.moveLeft();
        System.out.println(point); // Moved left

        point.moveRight();
        System.out.println(point); // Moved right

    }
}