.class public LQ3/r$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQ3/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Z

.field public b:Ld4/n;


# direct methods
.method public constructor <init>(ZLd4/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LQ3/r$c;->a:Z

    iput-object p2, p0, LQ3/r$c;->b:Ld4/n;

    return-void
.end method

.method public synthetic constructor <init>(ZLd4/n;LQ3/r$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LQ3/r$c;-><init>(ZLd4/n;)V

    return-void
.end method


# virtual methods
.method public a()Ld4/n;
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/r$c;->b:Ld4/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LQ3/r$c;->a:Z

    .line 2
    .line 3
    return v0
.end method
