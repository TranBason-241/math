/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import sonUtil.MathUtility;

/**
 *
 * @author ADMIN
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // kĩ thuật est căn bản: nhìn bằng mắt các est cases 
        // đúng sai
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
        //Kì vòng bằng 120, mày chạy thực tế ra cái gì thì tao lưu ở actual
        //so sánh bằng mắt
        System.out.println("5!? expected:" + expected + "; actual: " + actual);
        System.out.println("5!? expected: 720"+ "; actual: " + MathUtility.getFactorial(6));
        System.out.println("0!? expected: 1"+ "; actual: " + MathUtility.getFactorial(0));
        
        //TAO  KÌ VỌNG MÀY NÉM VỀ NGOẠI LỆ NẾU SAI
        //CHỐNG MẮT XEM ĐÚNG NGOẠI LỆ MÌNH CẦN NHƯ THIẾT KẾ ĐỂ CHỬI THẰNG XÀI HÀM K ĐÚNG CÁCH
        
    }
    //NHƯỢC ĐIỂM CỦA KĨ THUẬT NÀY:
    //cần phải dùng mắt để so sánh từng trường hợp xài hàm: so expected và actual
    //Nếu test nhiều tính huống, mắt đủ mệt mõi vì phả dò từng output
    
    //CÁCH NÂNG CAO
    //gom cả đám teesst cases mày lại, chạy 1 lợt như ở trên
    //máy so dùm ta luôn expected và actual
    //sau đó
    //NẾU TẤT CẢ CÁC CASES MÀ ĐỀU ĐÚNG, THẢY RA 1 XANH - ĐEN XANH - cODE ỔN
    //NẾU TẤT CẢ CÁC CASES ĐỀU ĐÚNG, NGOẠI TRƯ FCOS 1,2 VÀI THẰNG NÀO ĐÓ
    //EXPECTED KHÁC NHAU, THẢY RA 1 MÀU ĐỎ,HÀM Ý, HÀM SAI RỒI
    //                      HÀM ĐÚNG CẦN HẾT, MÀ SAI 1 VÀI, KHÔNG TIN CẬY XÀI HÀM
    //đỎ: CHỈ CÓ ÍT NHẤT 1 CẮP EXPECTED ACTUAL K BẰNG NHAU, KẾT LUẬN NGAY HÀM SAI
    
    //Thay vì nhìn từng cases ta chỉ nhìn màu xanh hoặc đỏ là đủ rồi
    //vậy ta cần bộ thư viện để giúp ta việc này
    //bộ thư viện làm 2 việc
    //so sanh giùm ACTUAL vs EXPECTED
    //              KHỚP -> thảy màu XANH
    //              KHÔNG KHỚP -> thảy màu ĐỎ
    //NÓ TỰ QUÉT HẾT CÁC CASE MÀ MÌNH ĐÃ THIẾT KẾ ĐỂ NÓ KẾT LUẬN, MẮ NHÌN DUY NHẤT MÀU LÀ ĐỦ
    //BỘ THƯ VIỆN NÀY CHÍNH LÀ NHỮNG FILE. JAR .DLL được ADD thêm vào PROJECT
    //Bộ thư viện này mang cái tên chung cho mọi ngôn ngữ lập trình - Unit test
    //Riêng cho java: JUnit, TestNG
    //          C# : NUNIT
    //          PHP : PHPUnit
    //          ... : ...
    //Đưa code lên server
}
