This page/repo contains the slides and demos from the presentation on Software 
Monitoring and DevOps with Prometheus given at infracoders meetup in Graz, Sep 2017.
Here's the bootleg.

<iframe src="https://www.facebook.com/plugins/video.php?href=https%3A%2F%2Fwww.facebook.com%2Finfralovers%2Fvideos%2F1960770547498524%2F&show_text=0&width=267" width="267" height="476" style="border:none;overflow:hidden" scrolling="no" frameborder="0" allowTransparency="true" allowFullScreen="true"></iframe>


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

As I'm alwas appreciating feedback, please contact me by twitter. Handle  [@goettl](https://twitter.com/goettl) 

Have Fun and happy DevOps!

