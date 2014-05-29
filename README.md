# ClickLabelExtension Add-on for Vaadin 7

ClickLabelExtension is an UI component add-on for Vaadin 7.

Make Vaadin Label widget clickable.
Catch click event from HTML element inside Label widget HTML content.

## Building and running demo

git clone <url of the ClickLabelExtension repository>
mvn clean install
cd demo
mvn jetty:run

To see the demo, navigate to http://localhost:8080/

## Development with Eclipse IDE

For further development of this add-on, the following tool-chain is recommended:
- Eclipse IDE
- m2e wtp plug-in (install it from Eclipse Marketplace)
- Vaadin Eclipse plug-in (install it from Eclipse Marketplace)
- JRebel Eclipse plug-in (install it from Eclipse Marketplace)
- Chrome browser

### Importing project

Choose File > Import... > Existing Maven Projects

Note that Eclipse may give "Plugin execution not covered by lifecycle configuration" errors for pom.xml. Use "Permanently mark goal resources in pom.xml as ignored in Eclipse build" quick-fix to mark these errors as permanently ignored in your project. Do not worry, the project still works fine. 

## Release notes

### Version 1.0-SNAPSHOT
- Initial release

## Roadmap

This component is developed as a hobby with no public roadmap or any guarantees of upcoming releases.

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

ClickLabelExtension is written by Marko Radinovic

# Developer Guide

## Getting started

Here is a simple example on how to try out the add-on component:

```java
final TextArea textArea = new TextArea("Click event details");
textArea.setSizeFull();

final Label demoLabel = new Label("Click on label");
                
final ClickLabelExtension extension = new ClickLabelExtension(demoLabel);
extension.addClickLabelListener(new ClickLabelListener() {

	@Override
	public void onLabelClick(ClickLabelEvent event) {
		final StringBuilder s = new StringBuilder();
		s.append("Clicked Element Details \n");
		s.append("event.getClickedElementDetails().getTagName() + "\n");
		s.append("event.getClickedElementDetails().getId() + "\n");
		s.append("event.getClickedElementDetails().getClassName() + "\n");
		s.append("event.getClickedElementDetails().getHtml() + "\n");
		s.append("event.getClickedElementDetails().getInnerHtml() + "\n");
		s.append("event.getClickedElementDetails().getInnerText() + "\n");
		s.append("-----------\n");
		s.append("MouseEventDetails\n");
		s.append(event.getMouseDetails().toString());
		textArea.setValue(s.toString());
	}
});
```
