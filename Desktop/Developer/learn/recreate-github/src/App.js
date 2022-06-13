import logo from './logo.svg';
import './App.css';
import NavigationBar from './components/NavigationBar';
import SearchBar from './components/SearchBar';
import HeroSection from './components/HeroSection';
import NewsletterForm from './components/NewsletterForm';
import StatsBar from './components/StatsBar';

function App() {
  return (
   <section>
     <NavigationBar></NavigationBar>
     <SearchBar></SearchBar>
     <HeroSection></HeroSection>
     <NewsletterForm></NewsletterForm>
     <StatsBar></StatsBar>
    </section>
  );
}

export default App;
