.class public abstract Lq1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq1/a$a;,
        Lq1/a$b;
    }
.end annotation


# static fields
.field public static final a:Lq1/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq1/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lq1/a$b;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lq1/a;->a:Lq1/a$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Landroid/content/Context;)Lq1/a;
    .locals 1

    .line 1
    sget-object v0, Lq1/a;->a:Lq1/a$b;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lq1/a$b;->a(Landroid/content/Context;)Lq1/a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public abstract b()Lb3/e;
.end method

.method public abstract c(Landroid/net/Uri;)Lb3/e;
.end method
