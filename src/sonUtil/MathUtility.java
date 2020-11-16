/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonUtil;

/**
 *
 * @author ADMIN
 */

public class MathUtility {
    
    
    public static final double PI = 3.1415;
    //chỉ tính từ 0 đến 20. lớn hơn 20 k tính
    //0! = 1! = 1
    public static long getFactorial(int n) {
        
        if(n<0 || n>20)
            throw new IllegalArgumentException("n must be between 0..20");
        if(n==0 || n==1)
                return 1;
        long result = 1;
        for(int i = 2; i<= n; i++){
            result *=i;
        }
        return result;
    }
    
    //Tự tin chạy đúng như thiết kế
    //Éo tin, phải test đã
    //Có nhiểu cách để test
    //Kiểu gì cugnx phải là mình tính trước kết quả hàm cần trả về expected value
    //                      mình gọi hàm coi nó chạy ra mấy. ACTUAL VALUE
    //so sánh coi EXPECTED VALUE = ACTUAL VALUE hay k
    //                            Có bằng, hàm chạy đúng tính huống x
    //                            không bằng, hàm chạy sai tình huống x
    //ví dụ
    //tao nghĩ rằng 5! = 120 (expected)
    //Giờ tao gọi hàm getFactorial (5 đưa vào), coi ra kết quả mấy (actual)
    // Nếu actual giả sử là 120 luôn, may quá hàm đúng cho 5! vì khớp kì vọng
    // case (tình huống) n=5 hàm đúng
    //case               n = 6 hmf trả về 720 thì hàm đúng
    //case               n=0 hàm trả về 1 thì là hàm đúng
    //...
    //Làm các case mà mình nghĩ là người dùng sẽ xài hàm như thế
    //tao gọi là các test cases
    //Một hàm có nhiều test cases ứn với nhiều tình huống xài hàm
    //Đảm bảo hàm đúng cho các case thì mới release
}
