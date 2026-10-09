/**
 * Java Proqramlaşdırma — Dərs 06
 * Tapşırıq Vərəqi — Bölmə F: Praktik Tapşırıq
 * Müəllim: Samir Abbasov
 * Xal: 10 / 10
 *
 * TAPŞIRIQ: Ders06Hesab
 *
 * Şərt:
 *   Ders06Hesab adlı Java proqramı yazın.
 *   Sinif aşağıdakı metodları əhatə etməlidir:
 *
 *   1. static int maks(int a, int b)
 *      — iki ədədin böyüyünü qaytarır
 *
 *   2. static int maks(int a, int b, int c)
 *      — üç ədədin böyüyünü qaytarır (overloading!)
 *      İpucu: maks(maks(a,b), c) istifadə edin
 *
 *   3. static boolean ciftMi(int n)
 *      — ədədin cüt olub-olmadığını qaytarır (% operatoru)
 *
 *   4. main metodunda hər üç metodu fərqli dəyərlərlə çağırıb nəticəni çap edin
 *
 * Nümunəvi çıxış:
 * ---------------
 *   maks(5, 12) = 12
 *   maks(7, 3, 15) = 15
 *   4 cüt ədəddir: true
 *   7 cüt ədəddir: false
 */
public class Ders06Hesab {

    // TODO 1: static int maks(int a, int b) metodunu yazın
    // Şərt ifadəsi (ternary) istifadə edə bilərsiniz: (a > b) ? a : b


    // TODO 2: static int maks(int a, int b, int c) metodunu yazın (overloading)
    // İpucu: yuxarıdakı maks(int,int) metodunu istifadə edin


    // TODO 3: static boolean cutdurmu(int n) metodunu yazın
    // İpucu: n % 2 == 0 ifadəsini istifadə edin


    public static void main(String[] args) {

        // TODO 4: Hər metodu aşağıdakı kimi çağırın və çap edin:
        // System.out.println("maks(5, 12) = " + maks(5, 12));
        // System.out.println("maks(7, 3, 15) = " + maks(7, 3, 15));
        // System.out.println("4 cut ededdir: " + cutdurmu(4));
        // System.out.println("7 cut ededdir: " + cutdurmu(7));

    }

}
