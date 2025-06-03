.class public final Lv3/o0$j$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv3/o0$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/net/Uri;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lv3/o0$j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lv3/o0$j;->a:Landroid/net/Uri;

    iput-object v0, p0, Lv3/o0$j$a;->a:Landroid/net/Uri;

    iget-object v0, p1, Lv3/o0$j;->b:Ljava/lang/String;

    iput-object v0, p0, Lv3/o0$j$a;->b:Ljava/lang/String;

    iget-object v0, p1, Lv3/o0$j;->c:Ljava/lang/String;

    iput-object v0, p0, Lv3/o0$j$a;->c:Ljava/lang/String;

    iget v0, p1, Lv3/o0$j;->d:I

    iput v0, p0, Lv3/o0$j$a;->d:I

    iget v0, p1, Lv3/o0$j;->e:I

    iput v0, p0, Lv3/o0$j$a;->e:I

    iget-object v0, p1, Lv3/o0$j;->f:Ljava/lang/String;

    iput-object v0, p0, Lv3/o0$j$a;->f:Ljava/lang/String;

    iget-object p1, p1, Lv3/o0$j;->g:Ljava/lang/String;

    iput-object p1, p0, Lv3/o0$j$a;->g:Ljava/lang/String;

    return-void
.end method
