.class public Ls4/j;
.super Ls3/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls4/j$a;
    }
.end annotation


# instance fields
.field public final o:Ls4/j$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ls4/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls3/l;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Ls4/j;->o:Ls4/j$a;

    return-void
.end method

.method public constructor <init>(Ls4/j$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ls3/l;-><init>()V

    iput-object p1, p0, Ls4/j;->o:Ls4/j$a;

    return-void
.end method
