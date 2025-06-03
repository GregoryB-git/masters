.class public final synthetic Lt6/j$a;
.super Lkotlin/jvm/internal/j;
.source "SourceFile"

# interfaces
.implements Lg6/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation


# static fields
.field public static final o:Lt6/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt6/j$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lt6/j$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt6/j$a;->o:Lt6/j$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v1, 0x3

    .line 5
    const-class v2, Ls6/c;

    .line 6
    .line 7
    const-string v3, "emit"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/j;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final b(Ls6/c;Ljava/lang/Object;LX5/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p3}, Ls6/c;->emit(Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ls6/c;

    .line 2
    .line 3
    check-cast p3, LX5/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lt6/j$a;->b(Ls6/c;Ljava/lang/Object;LX5/d;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
