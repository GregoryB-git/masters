.class public abstract Lo7/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo7/n$b;
    }
.end annotation


# static fields
.field public static final a:Lo7/n$a;

.field public static final b:Lo7/n$b;

.field public static final c:Lo7/n$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo7/n$a;

    invoke-direct {v0}, Lo7/n$a;-><init>()V

    sput-object v0, Lo7/n;->a:Lo7/n$a;

    new-instance v0, Lo7/n$b;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lo7/n$b;-><init>(I)V

    sput-object v0, Lo7/n;->b:Lo7/n$b;

    new-instance v0, Lo7/n$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lo7/n$b;-><init>(I)V

    sput-object v0, Lo7/n;->c:Lo7/n$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(II)Lo7/n;
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lo7/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lo7/n;"
        }
    .end annotation
.end method

.method public abstract c(ZZ)Lo7/n;
.end method

.method public abstract d(ZZ)Lo7/n;
.end method

.method public abstract e()I
.end method
