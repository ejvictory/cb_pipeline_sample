pipeline{
	agent any
	stages{
		stage('hello buildtriger'){
			steps{
				echo 'hello buildtriger 2'
			}
		}
	}
}
