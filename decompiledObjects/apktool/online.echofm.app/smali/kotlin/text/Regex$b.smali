.class public final Lkotlin/text/Regex$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/text/Regex;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/text/Regex$b$a;
    }
.end annotation


# static fields
.field public static final q:Lkotlin/text/Regex$b$a;

.field private static final serialVersionUID:J


# instance fields
.field public final o:Ljava/lang/String;

.field public final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlin/text/Regex$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/text/Regex$b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lkotlin/text/Regex$b;->q:Lkotlin/text/Regex$b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const-string v0, "pattern"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/text/Regex$b;->o:Ljava/lang/String;

    iput p2, p0, Lkotlin/text/Regex$b;->p:I

    return-void
.end method

.method private final readResolve()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lkotlin/text/Regex;

    iget-object v1, p0, Lkotlin/text/Regex$b;->o:Ljava/lang/String;

    iget v2, p0, Lkotlin/text/Regex$b;->p:I

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v2, "compile(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/util/regex/Pattern;)V

    return-object v0
.end method
