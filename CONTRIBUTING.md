# Contributing

When contributing to this repository, please first discuss the change you wish to make via issue,
email, or any other method with the owners of this repository before making a change. 

Please note we have a code of conduct, please follow it in all your interactions with the project.


## Suggesting

You can suggest in the issues with the new feature template.

## Pull Request Process

1. Fork the repo

2. Make your changes following the rules. ([see REPO RULES](https://github.com/bpteammc/world-plus/new/master#repo-rules))

3. Make a pull request and wait for a responce.


## REPO RULES:
- Check if the code doesn't crash on a dedicated server before pushing
- Push code to your own branch, let a dev merge your branch with the main one 
- Follow Java conventions ([See CONVENTIONS](https://github.com/bpteammc/world-plus/new/master#conventions))
- Use proper commit messages, it lets us write changelogs better
- Careful not to break anything
- If you don't know how to do something, ask first, don't break things....plz..

## CONVENTIONS 
- Camel Case for variable names (Never start a variable name with an uppercase character, this causes confusion with class names)
- Class names must always start with an uppercase character and follow camel case. 
Do this:
ThisIsCorrect
No this:
thisIsnotcorrect
- Static variable names must be in all uppercase:
public static int TIMER;

Only use static if you want a variable to be global over all instances of that class, if you're confused about, private, public, static, protected etc do a google search
- Variable names cannot contains spaces, nor can class names
(From [Suffril](https://www.github.com/suffril))
