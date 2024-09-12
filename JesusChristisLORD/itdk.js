// Function to show main pages
function showPage(pageId) {
    const pages = document.querySelectorAll('.page');
    pages.forEach(page => {
        page.classList.remove('active');
    });

    const activePage = document.getElementById(pageId);
    if (activePage) {
        activePage.classList.add('active');
    }
}

// Function to show sub-pages within the Home section
function showSubPage(subPageId) {
    const subPages = document.querySelectorAll('.sub-page');
    subPages.forEach(subPage => {
        subPage.classList.remove('active');
    });

    const activeSubPage = document.getElementById(subPageId);
    if (activeSubPage) {
        activeSubPage.classList.add('active');
    }
}

