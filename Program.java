package hw3;


public class Program {
    public static void main(String[] args) {
        
        UsersLinkedList users = new UsersLinkedList(); 
        users.add( new User("Василий", "Иванов", 18));
        users.add(new User("Петр", "Петров", 24));
        users.add(new User("Петр", "Губов", 24));
        users.add(new User("Ира", "Степанова", 21));
        
        System.out.println(users);

        for (User user : users) {
            System.out.println(user);
        }
    }

}
