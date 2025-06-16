/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let ans=0;
    let isNegative = x < 0;
    x = Math.abs(x);
    while(x>0){
        let a=x%10;
        ans=ans*10+a;
        x=Math.floor(x/10);
    }
    if (isNegative) ans *= -1;
    
    if (ans < -(2 ** 31) || ans > 2 ** 31 - 1) return 0;
    return ans;
};