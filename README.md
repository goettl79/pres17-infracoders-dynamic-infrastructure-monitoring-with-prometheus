# Dynamic Infrastructure Monitoring with Prometheus

This page contains slides and demos from my talk on dynamic software 
monitoring and devOps with prometheus given at infracoders meetup in Graz, Sep 2017.
As I'm always appreciating feedback please 
<a href="https://twitter.com/intent/tweet?screen_name=goettl&ref_src=twsrc%5Etfw" class="twitter-mention-button" data-show-count="false">tweet to @goettl</a><script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script> 

## Video 
<iframe src="https://www.facebook.com/plugins/video.php?href=https%3A%2F%2Fwww.facebook.com%2Finfralovers%2Fvideos%2F1960770547498524%2F&show_text=0&width=267" width="267" height="476" style="border:none;overflow:hidden" scrolling="no" frameborder="0" allowTransparency="true" allowFullScreen="true"></iframe>

## Slides
<iframe src="//www.slideshare.net/slideshow/embed_code/key/BwMVAwFgpCIiCV" width="595" height="485" frameborder="0" marginwidth="0" marginheight="0" scrolling="no" style="border:1px solid #CCC; border-width:1px; margin-bottom:5px; max-width: 100%;" allowfullscreen> </iframe> <div style="margin-bottom:5px"> <strong> <a href="//www.slideshare.net/GeorgOettl/dynamic-infrastructure-and-container-monitoring-with-prometheus" title="Dynamic Infrastructure and Container Monitoring with Prometheus" target="_blank">Dynamic Infrastructure and Container Monitoring with Prometheus</a> </strong> from <strong><a href="https://www.slideshare.net/GeorgOettl" target="_blank">Georg Öttl</a></strong> </div>

<br>


## Demo Setup Instructions

```
# Setup environment 
git clone https://github.com/goettl79/devops-with-prometheus.git
cd devops-with-prometheus/demo-prom-monitoring-gitblit
ansible-playbook playbook-local-host-setup.yml #adds necessary host entries to your /etc/hosts file
docker-compose up

# Start Browser on Services
google-chrome prometheus.infralovers.com & \
google-chrome grafana.infralovers.com & \
google-chrome gitblit.infralovers.com & 

# Start Integration / Performance Tests 
mvn install  test -f ../demo-prom-monitoring-gitblit/pom.xml
```
   
<a href="./prometheus-slides.md.html" target="_blank" type="text/html"><b>Slides Source, Happy DevOps!</b></a> 
