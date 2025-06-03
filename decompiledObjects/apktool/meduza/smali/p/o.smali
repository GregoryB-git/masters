.class public final Lp/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp/o$c;,
        Lp/o$b;,
        Lp/o$a;,
        Lp/o$d;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Intent;

.field public final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp/o;->a:Landroid/content/Intent;

    iput-object p2, p0, Lp/o;->b:Landroid/os/Bundle;

    return-void
.end method
