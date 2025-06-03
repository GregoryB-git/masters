.class public LP4/o;
.super Ls3/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP4/o$a;
    }
.end annotation


# instance fields
.field public final o:LP4/o$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls3/l;-><init>(Ljava/lang/String;)V

    sget-object p1, LP4/o$a;->p:LP4/o$a;

    iput-object p1, p0, LP4/o;->o:LP4/o$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LP4/o$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ls3/l;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, LP4/o;->o:LP4/o$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Ls3/l;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, LP4/o$a;->p:LP4/o$a;

    iput-object p1, p0, LP4/o;->o:LP4/o$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;LP4/o$a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Ls3/l;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p3, p0, LP4/o;->o:LP4/o$a;

    return-void
.end method
