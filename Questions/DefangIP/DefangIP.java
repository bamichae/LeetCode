package DefangIP;

public class DefangIP
{
    public String defang(String address)
    {
        return address.replaceAll("\\.", "[.]");
    }
}
