.class public final Lt8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt8/h<",
        "TK;TV;>;"
    }
.end annotation


# static fields
.field public static final a:Lt8/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt8/g;

    invoke-direct {v0}, Lt8/g;-><init>()V

    sput-object v0, Lt8/g;->a:Lt8/g;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lt8/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt8/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lt8/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Ljava/util/Comparator<",
            "TK;>;)",
            "Lt8/h<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance p3, Lt8/i;

    invoke-direct {p3, p1, p2}, Lt8/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method public final c(Ljava/lang/Object;Ljava/util/Comparator;)Lt8/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Comparator<",
            "TK;>;)",
            "Lt8/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final d(Lt8/h$a;Lt8/j;Lt8/j;)Lt8/h;
    .locals 0

    return-object p0
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final f()Lt8/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt8/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final g()Lt8/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt8/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h()Lt8/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt8/h<",
            "TK;TV;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
