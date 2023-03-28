const java = require('java');
java.classpath.push('..\\lib\\selenium-libs.jar');
java.classpath.push('\\lib\\junit-4.13.2.jar');
java.classpath.push('App.jar');

const webScrape = async () => {
    console.log("App iniciado...");
    const scrape = await java.import('App');
    await scrape.main(null);
}

webScrape();