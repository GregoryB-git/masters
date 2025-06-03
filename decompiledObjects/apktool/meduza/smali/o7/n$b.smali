.class public final Lo7/n$b;
.super Lo7/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo7/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lo7/n;-><init>()V

    iput p1, p0, Lo7/n$b;->d:I

    return-void
.end method


# virtual methods
.method public final a(II)Lo7/n;
    .locals 0

    return-object p0
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lo7/n;
    .locals 0
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

    return-object p0
.end method

.method public final c(ZZ)Lo7/n;
    .locals 0

    return-object p0
.end method

.method public final d(ZZ)Lo7/n;
    .locals 0

    return-object p0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lo7/n$b;->d:I

    return v0
.end method
