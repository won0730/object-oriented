import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    static Map<String, String> user = new HashMap<>();
    static {
        user.put("myId", "myPass");
        user.put("myId2", "myPass2");
        user.put("myId3", "myPass3");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean login = false;

        while (!login) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String inputId = sc.nextLine().trim();

            if (!user.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password: ");
            String inputPassword = sc.nextLine().trim();
            String password = user.get(inputId);

            if (!password.equals(inputPassword)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
            }else {
                System.out.println("id와 비밀번호가 일치합니다.");
                login = true;
            }
        }
    }
}