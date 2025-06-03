.class public final synthetic Le7/m4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic a:Le7/n4;

.field public synthetic b:I

.field public synthetic c:Ljava/lang/Exception;

.field public synthetic d:[B

.field public synthetic e:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Le7/n4;ILjava/io/IOException;[BLjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/m4;->a:Le7/n4;

    iput p2, p0, Le7/m4;->b:I

    iput-object p3, p0, Le7/m4;->c:Ljava/lang/Exception;

    iput-object p4, p0, Le7/m4;->d:[B

    iput-object p5, p0, Le7/m4;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Le7/m4;->a:Le7/n4;

    iget v3, p0, Le7/m4;->b:I

    iget-object v4, p0, Le7/m4;->c:Ljava/lang/Exception;

    iget-object v5, p0, Le7/m4;->d:[B

    iget-object v6, p0, Le7/m4;->e:Ljava/util/Map;

    iget-object v1, v0, Le7/n4;->c:Le7/k4;

    iget-object v2, v0, Le7/n4;->d:Ljava/lang/String;

    invoke-interface/range {v1 .. v6}, Le7/k4;->c(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method
