package HW11;

public class Magazine extends LibraryMaterial {
    private int issueNumber;

    public Magazine(String title, int issueNumber) {
        super(title, "Various Authors");
        this.issueNumber = issueNumber;
    }

    @Override
    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " Issue: " + issueNumber + " has been checked out.");
        } else {
            System.out.println(title + " Issue: " + issueNumber + " is not available.");
        }
    }

    @Override
    public void returnMaterial() {
        isAvailable = true;
        System.out.println(title + " Issue: " + issueNumber + " has been returned.");
    }

    @Override
    public boolean search(String keyword) {
        boolean found = title.contains(keyword) || Integer.toString(issueNumber).contains(keyword);
        System.out.println("Пошук за '" + keyword + "' у журналі '" + title + "': " + (found ? "знайдено" : "не знайдено"));
        return found;
    }

}


