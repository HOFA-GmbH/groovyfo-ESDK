import de.abas.eks.jfop.FOPException;
import de.abas.eks.jfop.FOPExitException;
import de.abas.eks.jfop.remote.ContextRunnable;
import de.abas.eks.jfop.remote.FOPSessionContext;
import de.finetech.groovy.ScriptExecutor;

public class GroovyFO implements ContextRunnable {

    @Override
    public int runFop(FOPSessionContext arg0, String[] arg1) throws FOPException, FOPExitException {
        return ScriptExecutor.executeScript(arg0, arg1);
    }

}
