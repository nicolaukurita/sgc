package br.com.etematica.sgc.service;

import br.com.etematica.sgc.model.Projeto;
import br.com.etematica.sgc.repository.ComponeneteRepository;
import br.com.etematica.sgc.repository.ProjetoRepository;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import java.io.StringWriter;
import java.util.List;
import java.util.Properties;

@Service
public class ProjetoService {

    public static String LOGGER_NAME = "velexample";

    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private ComponeneteRepository componeneteRepository;

    public List<Projeto> list() {
        return projetoRepository.findAll();
    }

    public String generate() {

        Projeto projeto = projetoRepository.getOne(1l);


        BasicConfigurator.configure();

        Logger log = Logger.getLogger( LOGGER_NAME );

        log.info("Log4jLoggerExample: ready to start velocity");

        Properties p = new Properties();
        p.setProperty("file.resource.loader.path", "target/classes/templates");
        VelocityEngine velocityEngine = new VelocityEngine();
//        velocityEngine.setProperty(VelocityEngine.RUNTIME_LOG_LOGSYSTEM,this);

        velocityEngine.init(p);

        Template template = velocityEngine.getTemplate("/db/mysql8.0.15.vm");
        VelocityContext context = new VelocityContext();

        context.put("database","World");
        context.put("projeto",projeto);

        StringWriter writer = new StringWriter();
        template.merge(context,writer);
        return writer.toString();
    }
}
