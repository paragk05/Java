public class dupli
{
    public static void main(String p[])
    {
        int a[]={1,2,3,3,4,4,4,5,6,7,7,8,8,8};
        int b[]={1,2,3,3,4,4,4,5,6,7,7,8,8,8};


        for (int i=0;i<a.length;i++)
        {
            for (int j = 0; j <a.length ; j++)
            {
                if(a[i]==a[j]);
                continue;

            }
            for (int j=0;j<a.length;j++)
            {
                if (a[i]==b[j])
                {
                    a[i]=b[j];
                }


            }


        }
        for (int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}
