# MVP-KYC

# How to Use


## Step 1. Add it in your root settings.gradle inside repositories:
		repositories {
			maven { url 'https://jitpack.io' }
			maven { url "https://cdn.veriff.me/android/" } 
		}
	
  
## Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.ahmedsalem9494:MVP-KYC:1.0.4'
	}
  
## Step 3. Call from Activity or Fragment

        val sessionUrl = "your_session_url"
        showMVPKYCScreen(sessionUrl)
  
