#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;

public class ${scratch-base-name}Main {

    @Parameter(names = { "-i", "--input" }, description = "Input Directory", required = true)
    private String inputDir;

    @Parameter(names = { "-o", "--output" }, description = "Output Directory", required = true)
    private String outputDir;

    @Parameter(names = "--help", help = true)
    private boolean help;

    public int run(String [] args) throws Exception {
        if (!parseArgs(args)) return -1;

        return 0;
    }

    public boolean parseArgs(String[] args) {
        JCommander jc = new JCommander(this);
        try {
            jc.parse(args);
            if (help) {
                usage(null, jc);
                return false;
            }
        }
        catch (ParameterException ex) {
            usage(ex.getMessage(), jc);
            return false;
        }
        return true;
    }

    public static void usage(String message, JCommander jc) {
        if (message != null) 
            System.err.println(message);
        StringBuilder out = new StringBuilder();
        jc.usage(out);
        System.err.println(out);
    }

    public static void main(String[] args) throws Exception {
       ${scratch-base-name}Main m = new ${scratch-base-name}Main();
       m.run(args);
    }
}
