.class public final Lkotlin/text/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/b;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public final d:Lg6/p;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILg6/p;)V
    .locals 1

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "getNextMatch"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lkotlin/text/c;->a:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iput p2, p0, Lkotlin/text/c;->b:I

    .line 17
    .line 18
    iput p3, p0, Lkotlin/text/c;->c:I

    .line 19
    .line 20
    iput-object p4, p0, Lkotlin/text/c;->d:Lg6/p;

    .line 21
    .line 22
    return-void
.end method

.method public static final synthetic a(Lkotlin/text/c;)Lg6/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/text/c;->d:Lg6/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lkotlin/text/c;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lkotlin/text/c;->a:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static final synthetic c(Lkotlin/text/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/text/c;->c:I

    return p0
.end method

.method public static final synthetic d(Lkotlin/text/c;)I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/text/c;->b:I

    return p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Lkotlin/text/c$a;

    invoke-direct {v0, p0}, Lkotlin/text/c$a;-><init>(Lkotlin/text/c;)V

    return-object v0
.end method
