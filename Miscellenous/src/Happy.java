public class Happy {
        public boolean isHappy(int n) {
            int s = n;
            int f = n;

            do{
                s = check(s);
                f = check(check(f));
            }while( s != f);

            return s == 1;
        }

        static int check(int n){
            int ans = 0;

            while(n>0){
                int last = n%10;
                ans += last*last;
                n /= 10;
            }
            return ans;
        }
}
