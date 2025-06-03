.class public final Lkotlin/text/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/text/f;


# instance fields
.field public final a:Ljava/util/regex/Matcher;

.field public final b:Ljava/lang/CharSequence;

.field public final c:Lkotlin/text/e;


# direct methods
.method public constructor <init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "matcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/text/g;->a:Ljava/util/regex/Matcher;

    iput-object p2, p0, Lkotlin/text/g;->b:Ljava/lang/CharSequence;

    new-instance p1, Lkotlin/text/g$a;

    invoke-direct {p1, p0}, Lkotlin/text/g$a;-><init>(Lkotlin/text/g;)V

    iput-object p1, p0, Lkotlin/text/g;->c:Lkotlin/text/e;

    return-void
.end method

.method public static final synthetic b(Lkotlin/text/g;)Ljava/util/regex/MatchResult;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkotlin/text/g;->c()Ljava/util/regex/MatchResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lkotlin/text/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/text/g;->c:Lkotlin/text/e;

    return-object v0
.end method

.method public final c()Ljava/util/regex/MatchResult;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/text/g;->a:Ljava/util/regex/Matcher;

    return-object v0
.end method
