.class public final Li0/e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li0/e$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/view/inputmethod/InputContentInfo;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/view/inputmethod/InputContentInfo;

    invoke-direct {v0, p1, p2, p3}, Landroid/view/inputmethod/InputContentInfo;-><init>(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V

    iput-object v0, p0, Li0/e$a;->a:Landroid/view/inputmethod/InputContentInfo;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Landroid/view/inputmethod/InputContentInfo;

    iput-object p1, p0, Li0/e$a;->a:Landroid/view/inputmethod/InputContentInfo;

    return-void
.end method


# virtual methods
.method public final a()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Li0/e$a;->a:Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getContentUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Li0/e$a;->a:Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->requestPermission()V

    return-void
.end method

.method public final c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Li0/e$a;->a:Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getLinkUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li0/e$a;->a:Landroid/view/inputmethod/InputContentInfo;

    return-object v0
.end method

.method public final getDescription()Landroid/content/ClipDescription;
    .locals 1

    iget-object v0, p0, Li0/e$a;->a:Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getDescription()Landroid/content/ClipDescription;

    move-result-object v0

    return-object v0
.end method
