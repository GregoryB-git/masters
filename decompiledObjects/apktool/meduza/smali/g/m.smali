.class public final synthetic Lg/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/i$a;


# instance fields
.field public final synthetic a:Lg/n;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/m;->a:Lg/n;

    return-void
.end method


# virtual methods
.method public final superDispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lg/m;->a:Lg/n;

    invoke-virtual {v0, p1}, Lg/n;->d(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
