
# Beispiel: Bubble Sort

var values [3] double

fn main(args *[] string) int
{
    values[0] = 4
    values[1] = 6
    values[2] = 2
    
    sort(values,3)
    
    main = 0
}

fn sort(arr *[] double, n int)
{
    var i int
    var k int
    
    i=0
    while i<n {
        k = 0
        while k<n {
            if arr[i]>arr[k] {
                swap(arr[i],arr[k])
            }
            k = k+1
        }
        i = i+1
    }
}

fn swap(x *double, y *double)
{
    var t double
    
    t = x
    x = y
    y = t
}
