.class public final Lp2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp2/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp2/a;

    invoke-direct {v0}, Lp2/a;-><init>()V

    sput-object v0, Lp2/a;->a:Lp2/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/io/File;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object p1

    const-string v0, "context.noBackupFilesDir"

    invoke-static {p1, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
